DESCRIPTION = "This package attempts to show the features of ROS step-by-step, including using messages, servers, parameters, etc."
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation rosconsole roscpp roscpp-serialization rostime std-msgs message-runtime rosconsole roscpp roscpp-serialization rostime std-msgs"

RDEPENDS_${PN} = "message-runtime rosconsole roscpp roscpp-serialization rostime std-msgs"

SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/melodic/roscpp_tutorials/0.9.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dd4e150bde56208333e9e92a83a4ab02"
SRC_URI[sha256sum] = "ea926bbb8d417ecfd5116647ffc45ede193fd3d6ad838c89b026560ce56e7987"

ROS_SPN = "ros_tutorials"
S = "${WORKDIR}/ros_tutorials-release-release-melodic-roscpp_tutorials-0.9.1-0"

inherit catkin
