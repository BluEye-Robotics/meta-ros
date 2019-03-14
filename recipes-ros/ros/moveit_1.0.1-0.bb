DESCRIPTION = "Meta package that contains all essential package of MoveIt!. Until Summer 2016 MoveIt! had been developed over multiple repositories, where developers' usability and maintenance effort was non-trivial. See"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-commander moveit-core moveit-planners moveit-plugins moveit-ros moveit-setup-assistant"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b97ad2590d5257a400a26a1e8b996d80"
SRC_URI[sha256sum] = "214f00c2a6ecf941adf7f2fb496023e48d27ee616d030b4dda85145d02319492"

S = "${WORKDIR}/moveit-release-release-melodic-moveit-1.0.1-0"

inherit catkin
