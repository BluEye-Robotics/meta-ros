DESCRIPTION = "Fetch Simulation, packages for working with Fetch and Freight in Gazebo"
AUTHOR = "Alex Moriarty"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "fetch-gazebo fetch-gazebo-demo fetchit-challenge"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_simulation/0.9.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e368ad0ebfc74671ebc4e74189262495"
SRC_URI[sha256sum] = "a032a7e561c95e807a9a87dd91b7f0fbe9263a0afbd14457813f1850f6c2717e"

ROS_SPN = "fetch_gazebo"
S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_simulation-0.9.1-0"

inherit catkin
