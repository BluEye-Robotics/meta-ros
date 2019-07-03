DESCRIPTION = "Driver for the Phidgets high speed encoder devices"
AUTHOR = "Geoff Viola"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libphidget21 phidgets-api roscpp std-msgs message-generation sensor-msgs libphidget21 phidgets-api roscpp std-msgs message-runtime sensor-msgs"

RDEPENDS_${PN} = "libphidget21 phidgets-api roscpp std-msgs message-runtime sensor-msgs"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_high_speed_encoder/0.7.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6764517dc1b902ec90acca41da75e531"
SRC_URI[sha256sum] = "d8b29845e8756bb602a1f63c030a3efee27fed46755d94574d696952ecdc05ef"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_high_speed_encoder-0.7.9-1"

inherit catkin
