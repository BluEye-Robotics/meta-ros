DESCRIPTION = "Yujin Robot's open-source control software"
AUTHOR = "Yujin Robot"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "yocs-cmd-vel-mux yocs-controllers yocs-diff-drive-pose-controller yocs-joyop yocs-keyop yocs-math-toolkit yocs-rapps yocs-safety-controller yocs-velocity-smoother yocs-virtual-sensor yocs-waypoints-navi"

RDEPENDS_${PN} = "yocs-cmd-vel-mux yocs-controllers yocs-diff-drive-pose-controller yocs-joyop yocs-keyop yocs-math-toolkit yocs-rapps yocs-safety-controller yocs-velocity-smoother yocs-virtual-sensor yocs-waypoints-navi"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yujin_ocs/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "765947980543483f052332792c76b9fb"
SRC_URI[sha256sum] = "fda374e1eaa08d31770f20eb374a2f781cf7a284403323c7d197f31428d9b1e5"

S = "${WORKDIR}/yujin_ocs-release-release-melodic-yujin_ocs-0.8.2-0"

inherit catkin
