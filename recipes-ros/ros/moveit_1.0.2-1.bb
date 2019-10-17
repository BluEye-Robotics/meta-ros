DESCRIPTION = "Meta package that contains all essential package of MoveIt!. Until Summer 2016 MoveIt! had been developed over multiple repositories, where developers' usability and maintenance effort was non-trivial. See"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-commander moveit-core moveit-planners moveit-plugins moveit-ros moveit-setup-assistant"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "84d7b140f65cb0a7b8f4e0e6f8e9e2b9"
SRC_URI[sha256sum] = "7ec4031dbef08128c3a4ed9b7f82b6a01700046c221076e236ce5c352d27084b"

S = "${WORKDIR}/moveit-release-release-melodic-moveit-1.0.2-1"

inherit catkin
