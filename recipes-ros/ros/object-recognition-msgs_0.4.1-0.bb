DESCRIPTION = "Object_recognition_msgs contains the ROS message and the actionlib definition used in object_recognition_core"
AUTHOR = "Vincent Rabaud"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs geometry-msgs message-generation sensor-msgs shape-msgs std-msgs actionlib-msgs geometry-msgs message-runtime sensor-msgs shape-msgs std-msgs"

RDEPENDS_${PN} = "actionlib-msgs geometry-msgs message-runtime sensor-msgs shape-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/object_recognition_msgs-release/archive/release/melodic/object_recognition_msgs/0.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b02d7cfddd894d20d4f7f8683b26e07b"
SRC_URI[sha256sum] = "0d4a39404ca6ce3fe26eb6a00df0edf208a58651c7605d42f20c9c6a2df9be72"

S = "${WORKDIR}/object_recognition_msgs-release-release-melodic-object_recognition_msgs-0.4.1-0"

inherit catkin
