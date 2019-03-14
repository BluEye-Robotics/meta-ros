DESCRIPTION = "Provides a node that reports how long a subset of joints has been settled. That is, it calculates how long a set of joints has remained within a specified threshold. This package is experimental and unstable. Expect its APIs to change."
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs rosconsole roscpp roscpp-serialization settlerlib std-msgs actionlib actionlib-msgs rosconsole roscpp roscpp-serialization settlerlib std-msgs"

RDEPENDS_${PN} = "actionlib actionlib-msgs rosconsole roscpp roscpp-serialization settlerlib std-msgs"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/joint_states_settler/0.10.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c35a99fa1e634a24b41bd32c785ae427"
SRC_URI[sha256sum] = "7625fdf3c7c87b21dd67a05f53faa5d09926c6065251b5d761b1ec3a23f79654"

ROS_SPN = "calibration"
S = "${WORKDIR}/calibration-release-release-melodic-joint_states_settler-0.10.14-0"

inherit catkin
