DESCRIPTION = "Bound incoming velocity messages according to robot velocity and acceleration limits."
AUTHOR = "Jorge Santos Simon"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp pluginlib nodelet geometry-msgs nav-msgs ecl-threads dynamic-reconfigure roscpp pluginlib nodelet geometry-msgs nav-msgs ecl-threads dynamic-reconfigure"

RDEPENDS_${PN} = "roscpp pluginlib nodelet geometry-msgs nav-msgs ecl-threads dynamic-reconfigure"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_velocity_smoother/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6b631fb38b57d2eafa08c6400501c37a"
SRC_URI[sha256sum] = "9de916242e06317201e15ac26eb33949b8f7aeb84dc262ee44e82ce5ceb3328a"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_velocity_smoother-0.8.2-0"

inherit catkin
