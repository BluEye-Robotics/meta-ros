DESCRIPTION = "effort_controllers"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles controller-interface control-msgs control-toolbox realtime-tools urdf forward-command-controller"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/effort_controllers/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c1977243da42a9dabb1b5164366cde26"
SRC_URI[sha256sum] = "52db667f0de73f3ceff16dc3ec2d5e5c3b4a1d67ede0c58c89a53883f194821e"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-effort_controllers-0.15.0-0"

inherit catkin
