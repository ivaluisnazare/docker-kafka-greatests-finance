package com.example.dockerkafkagreatestsfinance.avro;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase
        implements org.apache.avro.specific.SpecificRecord {

    private static final long serialVersionUID = -278509023743643639L;

    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse(
            "{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"br.com.tqi.dio\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"firstName\",\"type\":\"string\"},{\"name\":\"lastName\",\"type\":\"string\"}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<Employee> ENCODER = new BinaryMessageEncoder<Employee>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<Employee> DECODER = new BinaryMessageDecoder<Employee>(MODEL$, SCHEMA$);

    public static BinaryMessageEncoder<Employee> getEncoder() {
        return ENCODER;
    }

    public static BinaryMessageDecoder<Employee> getDecoder() {
        return DECODER;
    }

    public static BinaryMessageDecoder<Employee> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
    }

    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    public static Employee fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    @Deprecated
    public int id;

    @Deprecated
    public java.lang.CharSequence firstName;

    @Deprecated
    public java.lang.CharSequence lastName;

    public Employee() {
    }

    public Employee(java.lang.Integer id, java.lang.CharSequence firstName, java.lang.CharSequence lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return id;
            case 1:
                return firstName;
            case 2:
                return lastName;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }

    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                id = (java.lang.Integer) value$;
                break;
            case 1:
                firstName = (java.lang.CharSequence) value$;
                break;
            case 2:
                lastName = (java.lang.CharSequence) value$;
                break;
            default:
                throw new org.apache.avro.AvroRuntimeException("Bad index");
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public java.lang.CharSequence getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.CharSequence value) {
        this.firstName = value;
    }

    public java.lang.CharSequence getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.CharSequence value) {
        this.lastName = value;
    }

    public static Builder newBuilder() {
        return new Employee.Builder();
    }

    public static Builder newBuilder(Employee.Builder other) {
        if (other == null) {
            return new Employee.Builder();
        }
        else {
            return new Employee.Builder(other);
        }
    }

    public static Employee.Builder newBuilder(Employee other) {
        if (other == null) {
            return new Employee.Builder();
        }
        else {
            return new Employee.Builder(other);
        }
    }

    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
            implements org.apache.avro.data.RecordBuilder<Employee> {

        private int id;

        private java.lang.CharSequence firstName;

        private java.lang.CharSequence lastName;

        private Builder() {
            super(SCHEMA$);
        }

        private Builder(Employee.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.firstName)) {
                this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.lastName)) {
                this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
        }

        private Builder(Employee other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.id)) {
                this.id = data().deepCopy(fields()[0].schema(), other.id);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.firstName)) {
                this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.lastName)) {
                this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
                fieldSetFlags()[2] = true;
            }
        }

        public int getId() {
            return id;
        }

        public Employee.Builder setId(int value) {
            validate(fields()[0], value);
            this.id = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        public boolean hasId() {
            return fieldSetFlags()[0];
        }


        public Employee.Builder clearId() {
            fieldSetFlags()[0] = false;
            return this;
        }
        public java.lang.CharSequence getFirstName() {
            return firstName;
        }

        public Employee.Builder setFirstName(java.lang.CharSequence value) {
            validate(fields()[1], value);
            this.firstName = value;
            fieldSetFlags()[1] = true;
            return this;
        }
        public boolean hasFirstName() {
            return fieldSetFlags()[1];
        }

        public Employee.Builder clearFirstName() {
            firstName = null;
            fieldSetFlags()[1] = false;
            return this;
        }
        public java.lang.CharSequence getLastName() {
            return lastName;
        }
        public Employee.Builder setLastName(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.lastName = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        public boolean hasLastName() {
            return fieldSetFlags()[2];
        }
        public Employee.Builder clearLastName() {
            lastName = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Employee build() {
            try {
                Employee record = new Employee();
                record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
                record.firstName = fieldSetFlags()[1] ? this.firstName
                        : (java.lang.CharSequence) defaultValue(fields()[1]);
                record.lastName = fieldSetFlags()[2] ? this.lastName
                        : (java.lang.CharSequence) defaultValue(fields()[2]);
                return record;
            }
            catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            }
            catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }

    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<Employee> WRITER$ = (org.apache.avro.io.DatumWriter<Employee>) MODEL$
            .createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<Employee> READER$ = (org.apache.avro.io.DatumReader<Employee>) MODEL$
            .createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out) throws java.io.IOException {
        out.writeInt(this.id);

        out.writeString(this.firstName);

        out.writeString(this.lastName);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in) throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.id = in.readInt();

            this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8) this.firstName : null);

            this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8) this.lastName : null);

        }
        else {
            for (int i = 0; i < 3; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.id = in.readInt();
                        break;

                    case 1:
                        this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8) this.firstName : null);
                        break;

                    case 2:
                        this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8) this.lastName : null);
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }

}
