DESCRIPTION = "Package for creating a hardware interface to the robot using the EtherCAT motor controller/driver"
AUTHOR = "Rob Wheeler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation pr2-msgs pr2-hardware-interface eml roscpp realtime-tools diagnostic-msgs diagnostic-updater pluginlib log4cxx libtinyxml message-runtime pr2-msgs pr2-hardware-interface eml roscpp realtime-tools diagnostic-msgs diagnostic-updater pluginlib log4cxx libtinyxml"

RDEPENDS_${PN} = "message-runtime pr2-msgs pr2-hardware-interface eml roscpp realtime-tools diagnostic-msgs diagnostic-updater pluginlib log4cxx libtinyxml"

SRC_URI = "https://github.com/pr2-gbp/pr2_ethercat_drivers-release/archive/release/melodic/ethercat_hardware/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dc9a050f7423a2c65529b1eb42a3379a"
SRC_URI[sha256sum] = "43368d575a4d0b4f58a1e1896649012df83ba25fa63311ce42e26f5032d767f6"

ROS_SPN = "pr2_ethercat_drivers"
S = "${WORKDIR}/pr2_ethercat_drivers-release-release-melodic-ethercat_hardware-1.8.18-0"

inherit catkin
