DESCRIPTION = "This package contains messages for defining shapes, such as simple solid object primitives (cube, sphere, etc), planes, and meshes."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs message-generation std-msgs geometry-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/shape_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "726d6dd4174d5b00cf5f04922f3bbbda"
SRC_URI[sha256sum] = "77d8b3b79ef765cde23be9b753eab1e457888adbec1dd82fc8eadd3edeff83e3"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-shape_msgs-1.12.7-0"

inherit catkin
