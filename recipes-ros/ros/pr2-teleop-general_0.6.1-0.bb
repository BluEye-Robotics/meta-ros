DESCRIPTION = "pr2_teleop_general"
AUTHOR = "Gil Jones"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp actionlib actionlib-msgs geometry-msgs sensor-msgs pr2-msgs pr2-controllers-msgs pr2-controller-manager pr2-mechanism-msgs angles urdf ps3joy pr2-common-action-msgs polled-camera moveit-msgs tf tf moveit-msgs roscpp actionlib actionlib-msgs geometry-msgs sensor-msgs pr2-msgs pr2-controllers-msgs pr2-controller-manager pr2-mechanism-msgs angles urdf ps3joy pr2-common-action-msgs polled-camera pr2-tuck-arms-action pr2-arm-kinematics pr2-mannequin-mode"

RDEPENDS_${PN} = "tf moveit-msgs roscpp actionlib actionlib-msgs geometry-msgs sensor-msgs pr2-msgs pr2-controllers-msgs pr2-controller-manager pr2-mechanism-msgs angles urdf ps3joy pr2-common-action-msgs polled-camera pr2-tuck-arms-action pr2-arm-kinematics pr2-mannequin-mode"

SRC_URI = "https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_teleop_general/0.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "99371fb7d1dcf74c913f5eb3df4d7e21"
SRC_URI[sha256sum] = "e3ae1cbc8602721113121e1546387c770995bf51dda293c8d593919c38ba9863"

ROS_SPN = "pr2_apps"
S = "${WORKDIR}/pr2_apps-release-release-melodic-pr2_teleop_general-0.6.1-0"

inherit catkin
