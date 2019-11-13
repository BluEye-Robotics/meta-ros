DESCRIPTION = "This package holds example launch files for running the ROS navigation stack in stage."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl fake-localization gmapping map-server move-base stage-ros"

RDEPENDS_${PN} = "amcl fake-localization gmapping map-server move-base stage-ros"

SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/navigation_stage/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "74fdd773cbbd10bc0f7d678657f1091a"
SRC_URI[sha256sum] = "369bdc91f45d18128113301f533112e08708c83e02b16ae38f1bd765114d6310"

ROS_SPN = "navigation_tutorials"
S = "${WORKDIR}/navigation_tutorials-release-release-melodic-navigation_stage-0.2.3-1"

inherit catkin
