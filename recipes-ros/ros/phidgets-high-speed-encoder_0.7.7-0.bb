DESCRIPTION = "Driver for the Phidgets high speed encoder devices"
AUTHOR = "Geoff Viola"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libphidget21 phidgets-api roscpp std-msgs message-generation sensor-msgs libphidget21 phidgets-api roscpp std-msgs message-runtime sensor-msgs"

RDEPENDS_${PN} = "libphidget21 phidgets-api roscpp std-msgs message-runtime sensor-msgs"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_high_speed_encoder/0.7.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21b2b02a6f4185759c4c4d5eb87cc3b7"
SRC_URI[sha256sum] = "462219fb56f8ef2d8fbcf1b6237a6313fc1c5612f883cb0385ef3bfd5ae7f063"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_high_speed_encoder-0.7.7-0"

inherit catkin
