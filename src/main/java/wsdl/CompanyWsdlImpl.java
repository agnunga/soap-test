package wsdl;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by bitzero on 6/26/18.
 */
public class CompanyWsdlImpl {

    private Logger logger = Logger.getLogger(getClass().getSimpleName());
    FileHandler fileHandler;

    public void log() {
    }

    private Company_Service service;

    public CompanyWsdlImpl(){

        try {
            fileHandler = new FileHandler("CompanyWsdlImpl.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        service = new Company_ServiceLocator();
    }

    /*Get Departments from webservice*/
    public Departments[] getDepartments(){
        /*Use the service to get Departments*/
        logger.info("Getting Departments.");
        try {

            return service.getCompanyPort().fetchDepartments();

        }catch (Exception e){
            logger.log(Level.SEVERE, "An error occurred while fetching departments : " + e.getMessage());
            e.printStackTrace();
        }
        return null;

    }

    /*Get staff from webservice*/
    public Staff[] getStaff(int departmentId){

        /*Use the service to get Departments*/
        logger.info("Getting Staff.");
        try {

            return service.getCompanyPort().fetchStaff(departmentId).clone();

        }catch (Exception e){
            logger.log(Level.SEVERE, "An error occurred while fetching staff : " + e.getMessage());
        }
        return null;

    }
}
