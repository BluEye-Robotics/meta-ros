DESCRIPTION = "Simple Kalman Filter in Python"
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy rospy"

RDEPENDS_${PN} = "rospy"

SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/melodic/kalman_filter/0.2.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ad040a33af771afc7d750458b49b0498"
SRC_URI[sha256sum] = "dae8cee834dfdb902000812bf4e6141f678bf813a077dd6b6f1580a90a909876"

ROS_SPN = "wu_ros_tools"
S = "${WORKDIR}/wu_ros_tools-release-melodic-kalman_filter-0.2.4-0"

inherit catkin
