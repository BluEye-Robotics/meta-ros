DESCRIPTION = "Standard ROS Messages including common message types representing primitive data types and other basic message constructs, such as multiarrays. For common, generic robot-specific message types, please see"
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/std_msgs-release/archive/release/melodic/std_msgs/0.5.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9e26390cf7a361d3544239498490220"
SRC_URI[sha256sum] = "4e8b6a65ca70e92bbc9044c99cde67b5859392f6489e3e2fd7fc74844cedce1c"

S = "${WORKDIR}/std_msgs-release-release-melodic-std_msgs-0.5.12-0"

inherit catkin
