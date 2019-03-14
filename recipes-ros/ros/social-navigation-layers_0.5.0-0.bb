DESCRIPTION = "Plugin-based layers for the navigation stack that implement various social navigation contraints, like proxemic distance."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles costmap-2d dynamic-reconfigure geometry-msgs people-msgs pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wu-robotics/navigation_layers_release/archive/release/melodic/social_navigation_layers/0.5.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0eeef37b9734e4f3a6a5cf4c9d2c6238"
SRC_URI[sha256sum] = "106139809be8e491881b20b8510ca74eb2b73109bef94c30f1c58be452e2e4cd"

ROS_SPN = "navigation_layers"
S = "${WORKDIR}/navigation_layers_release-release-melodic-social_navigation_layers-0.5.0-0"

inherit catkin
