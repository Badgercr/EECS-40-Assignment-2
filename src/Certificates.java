

public class Certificates{
/*------------------variables-------------------*/
    private int number_of_certificates, index = 0;
    private String certificate_titles[], certificate_dates[];



/*------------------constructors-------------------*/

    /**
     * sets number of certificates and allocates memory for the certificates info
     * @param number_of_certificates number of certificate input
     */
    public Certificates(int number_of_certificates) {
        this.number_of_certificates = number_of_certificates;
        certificate_titles = new String[this.number_of_certificates];
        certificate_dates = new String[this.number_of_certificates];

    }

/*------------------functions-------------------*/
    public void add_certificate(String certificate_title, String date){
        certificate_titles[index] = certificate_title;
        certificate_dates[index] = date;
        index++;
    }
/*------------------setters-------------------*/

    public void setNumber_of_certificates(int number_of_certificates) {
        this.number_of_certificates = number_of_certificates;
        certificate_titles = new String[this.number_of_certificates];
        certificate_dates = new String[this.number_of_certificates];
    }

    public void setCertificate_titles(String[] certificate_titles) {
        this.certificate_titles = certificate_titles;
    }

    public void setCertificate_dates(String[] certificate_dates) {
        this.certificate_dates = certificate_dates;
    }
    /*------------------getters-------------------*/

    public int getNumber_of_certificates() {
        return number_of_certificates;
    }

    public String[] getCertificate_titles() {
        return certificate_titles;
    }

    public String[] getCertificate_dates() {
        return certificate_dates;
    }
}
