DESCRIPTION = "Ros extensions and behaviours for py_trees."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-setuptools"

RDEPENDS_${PN} = "dynamic-reconfigure geometry-msgs move-base-msgs python-termcolor nav-msgs sensor-msgs actionlib actionlib-msgs py-trees py-trees-msgs python-rospkg rosbag rospy std-msgs unique-id uuid-msgs"

SRC_URI = "https://github.com/stonier/py_trees_ros-release/archive/release/melodic/py_trees_ros/0.5.16-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70a49946bc31d3528d87b3f8eb010a17"
SRC_URI[sha256sum] = "ff4969870401c0ab359a185328c283b3e50ac51c2edad4dcefda781735bf7ecb"

S = "${WORKDIR}/py_trees_ros-release-release-melodic-py_trees_ros-0.5.16-0"

inherit catkin
