package com.minttcode.hackathon.iqr.service;

import com.minttcode.hackathon.iqr.model.Device;
import com.minttcode.hackathon.iqr.model.repos.DeviceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    private static final Logger logger = LoggerFactory.getLogger(DeviceService.class);

    public Device createDevice(Device device) {
        Device dev = null;
        if (device != null){
            dev  = deviceRepository.save(device);
        }

        return dev;
    }



    public Device getDevice(String deviceId) {
        Optional<Device> dev = null;
        if (deviceId != null){
            dev  = deviceRepository.findById(deviceId);
        }
        return dev.get();
    }



    public boolean deleteDevice(String id) {
        boolean ret = false;

        if (id != null){
           Optional<Device> deviceOptional =  deviceRepository.findById(id);
            if (deviceOptional.isPresent()){
                deviceRepository.delete(deviceOptional.get());
               ret = true;
            }
        }

        return ret;
    }


    public Device updateDevice (Device dev) {
        Optional<Device> deviceOptional = null;
        if (dev != null && dev.getId() != null){
            deviceOptional = deviceRepository.findById(dev.getId());
            if (deviceOptional.isPresent()){
                boolean update = false;
                if (dev.getFingerPrint() != null && dev.getFingerPrint() !=  deviceOptional.get().getFingerPrint() ) {
                    deviceOptional.get().setFingerPrint(dev.getFingerPrint());
                    update = true;
                }

                if (dev.getTokenFirebase() != null && dev.getTokenFirebase() !=  deviceOptional.get().getTokenFirebase() ) {
                    deviceOptional.get().setTokenFirebase(dev.getTokenFirebase());
                    update = true;
                }
                if (update){
                    deviceRepository.save(deviceOptional.get());
                }

            }
        }
        return deviceOptional.get();
    }






}
