DESCRIPTION = "Messages used by py_trees_ros and some extras for the mock demos/tests."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs dynamic-reconfigure message-generation std-msgs uuid-msgs"

RDEPENDS_${PN} = "actionlib-msgs dynamic-reconfigure message-runtime std-msgs uuid-msgs"

SRC_URI = "https://github.com/stonier/py_trees_msgs-release/archive/release/melodic/py_trees_msgs/0.3.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7ec9853003f790094ffa3462e2460d8e"
SRC_URI[sha256sum] = "71d8d3b25202546af7f8f085a532d72bf3fc35a591958d88927c6506571f3b37"

S = "${WORKDIR}/py_trees_msgs-release-release-melodic-py_trees_msgs-0.3.6-0"

inherit catkin
