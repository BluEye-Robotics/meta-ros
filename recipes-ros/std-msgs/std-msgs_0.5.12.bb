DESCRIPTION = "Standard ROS Messages including common message types representing primitive data types and other basic message constructs, such as multiarrays. \
    For common, generic robot-specific message types, please see common_msgs."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation message-runtime"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9fb4781dea973b6f6d01c9df464b844f"
SRC_URI[sha256sum] = "bdb35e40493ce5e30c9ad93d75964356a8dbfea5df3c6e6630f9ea4905dedc02"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
