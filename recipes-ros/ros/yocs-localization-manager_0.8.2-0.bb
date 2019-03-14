DESCRIPTION = "Localization Manager helps to localize robot's position with annotated information"
AUTHOR = "Jihoon Lee"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint rospy actionlib ar-track-alvar ar-track-alvar-msgs geometry-msgs std-msgs yocs-msgs dynamic-reconfigure tf"

RDEPENDS_${PN} = "rospy actionlib ar-track-alvar ar-track-alvar-msgs geometry-msgs std-msgs yocs-msgs dynamic-reconfigure tf"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_localization_manager/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c4bcf5c0966f13184383f1d5216db39a"
SRC_URI[sha256sum] = "eb2e39a17f8f78cbe98c04b73a63d666fb5937156490539ae49ad1e94b607a49"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_localization_manager-0.8.2-0"

inherit catkin
