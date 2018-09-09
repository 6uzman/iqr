package com.minttcode.hackathon.iqr.endpoint;

import com.minttcode.hackathon.iqr.model.Device;
import com.minttcode.hackathon.iqr.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    private static final Logger logger = LoggerFactory.getLogger(DeviceController.class);

    @PostMapping
    public @ResponseBody
    Device createDevice(@RequestBody Device device) {
        Device dev = null;
        if (device != null){
             dev = deviceService.createDevice(device);
        }
        return dev;
    }


    @DeleteMapping
    public void deleteDevice(@RequestBody Device device ) {
        if ( device != null && device.getId() != null){
            deviceService.deleteDevice(device.getId());
        }

    }

    @GetMapping("/{idDevice}")
    public @ResponseBody Device getDeviceById(@PathVariable String idDevice){
        Device dev = null;
        if (idDevice != null){
            dev = deviceService.getDevice(idDevice);
        }
        return  dev;
    }



}
