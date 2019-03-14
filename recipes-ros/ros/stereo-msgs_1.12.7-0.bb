DESCRIPTION = "stereo_msgs contains messages specific to stereo processing, such as disparity images."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation sensor-msgs std-msgs message-runtime sensor-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime sensor-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/stereo_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0616309fd050c3008dc58340317da4bb"
SRC_URI[sha256sum] = "18b3d8ec019e01a906981d524a8f1d0cc067e39f53494f1ce0a8c94e07801340"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-stereo_msgs-1.12.7-0"

inherit catkin
