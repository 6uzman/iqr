package com.minttcode.hackathon.iqr.model.repos;

import com.minttcode.hackathon.iqr.model.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository  extends MongoRepository<Device, String> {

}
