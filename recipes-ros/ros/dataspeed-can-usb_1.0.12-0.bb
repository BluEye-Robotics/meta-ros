DESCRIPTION = "Driver to interface with the Dataspeed Inc. USB CAN Tool"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslib roscpp nodelet can-msgs std-msgs lusb"

RDEPENDS_${PN} = "roslaunch"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_can-release/archive/release/melodic/dataspeed_can_usb/1.0.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3ba824a04cc02750d06f4a3260254622"
SRC_URI[sha256sum] = "e664af652ae15f28732366c4ced5ee7d6cdb7e16183a5fec6d37c35856515013"

ROS_SPN = "dataspeed_can"
S = "${WORKDIR}/dataspeed_can-release-release-melodic-dataspeed_can_usb-1.0.12-0"

inherit catkin
