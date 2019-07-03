DESCRIPTION = "Driver for the Phidgets InterfaceKit devices"
AUTHOR = "James Sarrett"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs nodelet phidgets-api roscpp sensor-msgs std-msgs message-generation tf geometry-msgs nodelet phidgets-api roscpp sensor-msgs std-msgs message-runtime tf"

RDEPENDS_${PN} = "geometry-msgs nodelet phidgets-api roscpp sensor-msgs std-msgs message-runtime tf"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_ik/0.7.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e6bc4b281bd8fd29645b5ade65288e11"
SRC_URI[sha256sum] = "f7b6b527e58c2e93b61612f57ca708a383e6082de8774ea467a33eea0fae3e25"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_ik-0.7.9-1"

inherit catkin
