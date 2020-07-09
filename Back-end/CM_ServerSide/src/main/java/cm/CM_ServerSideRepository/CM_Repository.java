package cm.CM_ServerSideRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cm.CM_ServerSideModel.CM_Model;

@Repository
public interface CM_Repository extends JpaRepository<CM_Model, String> {

}
