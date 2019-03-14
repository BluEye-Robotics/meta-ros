DESCRIPTION = "effort_controllers"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles controller-interface control-msgs control-toolbox realtime-tools urdf forward-command-controller"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/effort_controllers/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "af42c898c306224909b3436365e74d3b"
SRC_URI[sha256sum] = "184d697921121f935c6512ff5b6e2044dcb5d344d90da2e716fcfa6baa0e0c77"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-effort_controllers-0.14.3-0"

inherit catkin
