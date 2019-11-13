DESCRIPTION = ""
AUTHOR = "MoveIt Setup Assistant"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-simple-controller-manager moveit-planners-ompl moveit-ros-visualization joint-state-publisher robot-state-publisher moveit-ros-move-group xacro industrial-robot-simulator abb-irb2400-support abb-irb2400-moveit-plugins"

SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb2400_moveit_config/1.3.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a58bfd94e5a034a308148b4a735d971f"
SRC_URI[sha256sum] = "cb059c41a63c0ed80fc4cdc039db24a661e627cef5ea0ff97b060896f8fcd8f2"

ROS_SPN = "abb"
S = "${WORKDIR}/abb-release-release-melodic-abb_irb2400_moveit_config-1.3.1-1"

inherit catkin
