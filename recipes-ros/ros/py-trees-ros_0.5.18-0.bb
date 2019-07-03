DESCRIPTION = "Ros extensions and behaviours for py_trees."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-setuptools"

RDEPENDS_${PN} = "dynamic-reconfigure geometry-msgs move-base-msgs python-termcolor nav-msgs sensor-msgs actionlib actionlib-msgs py-trees py-trees-msgs python-rospkg rosbag rospy std-msgs unique-id uuid-msgs"

SRC_URI = "https://github.com/stonier/py_trees_ros-release/archive/release/melodic/py_trees_ros/0.5.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0ff816bf9f8ba3bd2919e5a01ab28bf3"
SRC_URI[sha256sum] = "1bc3f54d395458994329b16c3e3abff63702270a44e1443c5cafafe85a7362ac"

S = "${WORKDIR}/py_trees_ros-release-release-melodic-py_trees_ros-0.5.18-0"

inherit catkin
