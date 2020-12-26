package lk.usj.OPD_Management.java.service.custom;

import lk.usj.OPD_Management.java.dto.VisitorDTO;
import lk.usj.OPD_Management.java.service.SuperBO;

public interface VisitorBO extends SuperBO {

    boolean addVisitor(VisitorDTO visitorDTO)throws Exception;

    int getNextVisitorID() throws Exception;
}
