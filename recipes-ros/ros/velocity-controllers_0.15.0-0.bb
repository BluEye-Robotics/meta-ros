DESCRIPTION = "velocity_controllers"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles control-msgs control-toolbox controller-interface forward-command-controller realtime-tools urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/velocity_controllers/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fd562506e81f05f26092fae6e372b03b"
SRC_URI[sha256sum] = "7a2b419156bb96923bd97e0ffe3ffda525f2fdc4027868c461590c749c379cbb"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-velocity_controllers-0.15.0-0"

inherit catkin
