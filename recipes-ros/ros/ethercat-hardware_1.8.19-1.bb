DESCRIPTION = "Package for creating a hardware interface to the robot using the EtherCAT motor controller/driver"
AUTHOR = "Rob Wheeler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation pr2-msgs pr2-hardware-interface eml roscpp realtime-tools diagnostic-msgs diagnostic-updater pluginlib log4cxx libtinyxml message-runtime pr2-msgs pr2-hardware-interface eml roscpp realtime-tools diagnostic-msgs diagnostic-updater pluginlib log4cxx libtinyxml"

RDEPENDS_${PN} = "message-runtime pr2-msgs pr2-hardware-interface eml roscpp realtime-tools diagnostic-msgs diagnostic-updater pluginlib log4cxx libtinyxml"

SRC_URI = "https://github.com/pr2-gbp/pr2_ethercat_drivers-release/archive/release/melodic/ethercat_hardware/1.8.19-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0cf1133f757b14ae0d467b82b18a5b2b"
SRC_URI[sha256sum] = "b2d0eea54e31386b19e79f7929b0885f1e5402b3c0efaafe70267bc5c51dbbfc"

ROS_SPN = "pr2_ethercat_drivers"
S = "${WORKDIR}/pr2_ethercat_drivers-release-release-melodic-ethercat_hardware-1.8.19-1"

inherit catkin
