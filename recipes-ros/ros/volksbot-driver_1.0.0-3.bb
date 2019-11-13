DESCRIPTION = "Driver for the Volksbot robot."
AUTHOR = "Jochen Sprickerhof"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "epos2-motor-controller geometry-msgs nav-msgs roscpp sensor-msgs tf"

RDEPENDS_${PN} = "epos2-motor-controller roscpp sensor-msgs geometry-msgs nav-msgs tf"

SRC_URI = "https://github.com/uos-gbp/volksbot_driver-release/archive/release/melodic/volksbot_driver/1.0.0-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d355a411639f6447ed2c7a7722edd982"
SRC_URI[sha256sum] = "a46e4b3d0321766d6cae107019a7d3aecfd3babf0e4b767c316e489e45ae2cef"

S = "${WORKDIR}/volksbot_driver-release-release-melodic-volksbot_driver-1.0.0-3"

inherit catkin
