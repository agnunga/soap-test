import utils.DBHelper;
import lookup.LookupDataLoader;
import wsdl.Departments;
import wsdl.CompanyWsdlImpl;
import wsdl.Staff;

/**
 * Created by bitzero on 6/26/18.
 */
public class Main {

    public static void main(String[] args){
        //This runs code for Question 1
        testQ1();
        //This runs code for Question 2
        testQ2();

    }

    private static void testQ1(){

        CompanyWsdlImpl companyWsdlImpl = new CompanyWsdlImpl();
         /*Retrieving Company Data From Webservice*/
        Departments[] departments = companyWsdlImpl.getDepartments();

        if(departments != null && departments.length > 0) {

            DBHelper dbHelper = new DBHelper();

            for (Departments department : departments) {
                System.out.println("Department ID ::: " + department.getDepartmentID());

                //Store Department in Rdbms
                dbHelper.storeDepartments(department);

                //Get the staff for the current department
                Staff[] staff = companyWsdlImpl.getStaff(department.getDepartmentID());
                if (staff != null && staff.length > 0) {
                    for (Staff staff1 : staff) {
                        //Store staff For The given department
                        dbHelper.storeStaff(staff1);
                        System.out.println("Staff Id ::: " + staff1.getStaffID());

                    }
                }
            }
        }else {
            System.out.println("The Departments Array is null. Do not expect much");
        }

        /*Testing connection to mysql*/
//        MysqlCon mysqlCon = new MysqlCon();
//        System.out.println("Connected to Db :: " + mysqlCon.connectTODb());

//        DBHelper dbHelper = new DBHelper();
//
//        /*For testing*/
//        dbHelper.storeDepartments(new Departments("dfsdf", "dfsdf", 3, "dfsdf", "dfsdf"));
//        dbHelper.storeStaff(new Staff("dfsdf", "dfsdf", 3, "dfsdf", "dfsdf", "dfsdf", 3));

    }

    private static void testQ2(){
        LookupDataLoader loadData = new LookupDataLoader();


        String cvsFileName = "Students3DArrayTest.csv";
        //        String url = "http://goo.gl/vqS5RV";
        //        String url = "https://www.dropbox.com/s/zb0dmmswbb2gjgh/Students3DArrayTest.csv?dl=0";

        /*I've used the url above to get the the url of .csv file*/
        String url = "https://ucefdaa21d15212e95d0b832bf2e.dl.dropboxusercontent.com/cd/0/get/AJ1RheH7wRKKBkI9nIoTANIuY8wncokNJeTe37JXq6ONZ-PqwrPUqBVQHemIMmJbKp-lfYZS-sVBfE8rXNa6_1p_2YcNz4IfW7wDE_USdXg8MM16Dp7qDFV1ZOmVPScxM6EQfVtFl_gO13nyZ0FhntxIeZrP9MxXMNA7eEJYf6RrPdYH2uRHa5ln0q7JQr3P258/file?_download_id=31507857915335546924243226515885196033639000792254438697583401974&_notify_domain=www.dropbox.com&dl=1";

        /*Retrieving Data From the lookup (http://goo.gl/vqS5RV)*/
        System.out.println("Data downloaded from lookup? " + loadData.loadDataFromLookup(cvsFileName, url));
        loadData.readDownloadedCsv();

    }
}
