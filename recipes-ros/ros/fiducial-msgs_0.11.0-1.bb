DESCRIPTION = "Package containing message definitions for fiducials"
AUTHOR = "Jim Vaughan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs sensor-msgs std-msgs tf message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/melodic/fiducial_msgs/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3fa7cee7a811fb8e2fe3637c276e5e5a"
SRC_URI[sha256sum] = "f518a98e96490068c7b4d086801cca8b5948d274451c03e1e82221fde3101366"

ROS_SPN = "fiducials"
S = "${WORKDIR}/fiducials-release-release-melodic-fiducial_msgs-0.11.0-1"

inherit catkin
