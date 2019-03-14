DESCRIPTION = "Driver for the Phidgets InterfaceKit devices"
AUTHOR = "James Sarrett"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs nodelet phidgets-api roscpp sensor-msgs std-msgs message-generation tf geometry-msgs nodelet phidgets-api roscpp sensor-msgs std-msgs message-runtime tf"

RDEPENDS_${PN} = "geometry-msgs nodelet phidgets-api roscpp sensor-msgs std-msgs message-runtime tf"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_ik/0.7.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "04dfe094afd0d032dea7b3b77ef089f7"
SRC_URI[sha256sum] = "961d4102b53a0c33873c0cf8ac376d3bebe6e54f636c461600619b379d52fec7"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_ik-0.7.7-0"

inherit catkin
