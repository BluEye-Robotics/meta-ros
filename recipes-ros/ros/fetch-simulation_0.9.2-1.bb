DESCRIPTION = "Fetch Simulation, packages for working with Fetch and Freight in Gazebo"
AUTHOR = "Alex Moriarty"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "fetch-gazebo fetch-gazebo-demo fetchit-challenge"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_simulation/0.9.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1f2297dee9b4751434c5fd42b7a52743"
SRC_URI[sha256sum] = "76b37846fcf07da29ab58753137ef1f324d53e8f6ca225fe46310e6673c7d801"

ROS_SPN = "fetch_gazebo"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_simulation-0.9.2-1"

inherit catkin
