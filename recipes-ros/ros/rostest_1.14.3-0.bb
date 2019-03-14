DESCRIPTION = "Integration test suite based on roslaunch that is compatible with xUnit frameworks."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost rosunit boost rosgraph roslaunch rosmaster rospy rosunit"

RDEPENDS_${PN} = "boost rosgraph roslaunch rosmaster rospy rosunit"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rostest/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cf4345a7d663dec3d10a6eef5816c6f2"
SRC_URI[sha256sum] = "90e7b4ba3167ae06f5ad213c193b0c5ab7888b4abd75542a3d7c02592ef9c707"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rostest-1.14.3-0"

inherit catkin
