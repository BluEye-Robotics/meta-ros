DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "Chad Rockey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp gtest sensor-msgs nodelet image-transport image-geometry dynamic-reconfigure roscpp sensor-msgs nodelet image-transport image-geometry dynamic-reconfigure"

RDEPENDS_${PN} = "roscpp sensor-msgs nodelet image-transport image-geometry dynamic-reconfigure"

SRC_URI = "https://github.com/ros-gbp/depthimage_to_laserscan-release/archive/release/melodic/depthimage_to_laserscan/1.0.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cf178b822c0dca354263212035de2aee"
SRC_URI[sha256sum] = "0620a9a74ab3a0601a55d1cbe593abe68bbc838ea3fb6a1dfa57ac7e6e3c10ca"

S = "${WORKDIR}/depthimage_to_laserscan-release-release-melodic-depthimage_to_laserscan-1.0.8-0"

inherit catkin
