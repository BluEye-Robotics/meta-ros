DESCRIPTION = "The industrial robot simulator is a stand in for industrial robot driver node(s). It adheres to the driver specification for industrial robot controllers."
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "control-msgs industrial-msgs industrial-robot-client python-rospkg rospy sensor-msgs trajectory-msgs"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_robot_simulator/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a725252748ef1533edb8a2ebe3e78d53"
SRC_URI[sha256sum] = "2bfbab889523137f608c09ad70ae7f13953e539f7999237d9296648e4d523962"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_robot_simulator-0.7.1-1"

inherit catkin
