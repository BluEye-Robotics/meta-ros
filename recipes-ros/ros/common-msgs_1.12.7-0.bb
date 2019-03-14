DESCRIPTION = "common_msgs contains messages that are widely used by other ROS packages. These includes messages for actions ("
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs diagnostic-msgs geometry-msgs nav-msgs sensor-msgs shape-msgs stereo-msgs trajectory-msgs visualization-msgs"

RDEPENDS_${PN} = "actionlib-msgs diagnostic-msgs geometry-msgs nav-msgs sensor-msgs shape-msgs stereo-msgs trajectory-msgs visualization-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/common_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "07cad3850713b2badfeecd32822cd86f"
SRC_URI[sha256sum] = "631a7674053674e50d7fdadc741dcd4f112f0f12c62c179b438e0db457e86a36"

S = "${WORKDIR}/common_msgs-release-release-melodic-common_msgs-1.12.7-0"

inherit catkin
