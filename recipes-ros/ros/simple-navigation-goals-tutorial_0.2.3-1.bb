DESCRIPTION = "The simple_navigation_goals_tutorial package"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib move-base-msgs roscpp tf actionlib move-base-msgs roscpp tf"

RDEPENDS_${PN} = "actionlib move-base-msgs roscpp tf"

SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/simple_navigation_goals_tutorial/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6e158cca7caa7ce7c13630810a1e5259"
SRC_URI[sha256sum] = "822743ee6df1764688c0cd3898150d95fa634fc85224ee6e2024d2f45f9d1799"

ROS_SPN = "navigation_tutorials"
S = "${WORKDIR}/navigation_tutorials-release-release-melodic-simple_navigation_goals_tutorial-0.2.3-1"

inherit catkin
