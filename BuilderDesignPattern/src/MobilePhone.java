public class MobilePhone {
    //it is must field
    private String company;

    //optional field
    private String processor;
    private String ram;
    private String storage;
    private boolean dualsim;

    private MobilePhone(MobilePhoneBuilder builder) {
        this.company = builder.company;
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.dualsim = builder.dualsim;
    }


    public String getCompany() {
        return company;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public boolean isDualsim() {
        return dualsim;
    }

    public static class MobilePhoneBuilder{

        //it is must field
        private String company;

        //optional field
        private String processor;
        private String ram;
        private String storage;
        private boolean dualsim;

        MobilePhoneBuilder(String company)
        {
            this.company=company;
        }

        public MobilePhoneBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public MobilePhoneBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public MobilePhoneBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public MobilePhoneBuilder setDualsim(boolean dualsim) {
            this.dualsim = dualsim;
            return this;
        }

        public MobilePhone build()
        {
            return new MobilePhone(this);
        }
    }
}
