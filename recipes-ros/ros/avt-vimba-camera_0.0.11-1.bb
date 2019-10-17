DESCRIPTION = "Wrapper of the Allied Vision Technologies (AVT) VIMBA Ethernet and Firewire SDK."
AUTHOR = "Miquel Massot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager diagnostic-updater dynamic-reconfigure image-geometry image-transport message-filters roscpp sensor-msgs std-msgs polled-camera nodelet camera-info-manager diagnostic-updater dynamic-reconfigure image-geometry image-transport message-filters roscpp sensor-msgs std-msgs polled-camera nodelet image-proc stereo-image-proc"

RDEPENDS_${PN} = "camera-info-manager diagnostic-updater dynamic-reconfigure image-geometry image-transport message-filters roscpp sensor-msgs std-msgs polled-camera nodelet image-proc stereo-image-proc"

SRC_URI = "https://github.com/astuff/avt_vimba_camera-release/archive/release/melodic/avt_vimba_camera/0.0.11-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "54bd1f3a41ccb4b1d2b35c98e3f80db5"
SRC_URI[sha256sum] = "2ef59b4dcd0006486e9a68b469485bd13f54d6cc9f1d76a2b01ae229c8a1a6a4"

S = "${WORKDIR}/avt_vimba_camera-release-release-melodic-avt_vimba_camera-0.0.11-1"

inherit catkin
