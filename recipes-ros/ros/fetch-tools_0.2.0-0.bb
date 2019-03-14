DESCRIPTION = "Commands for performing common operations when developing on the robots. For help, run `fetch -h` and `fetch COMMAND -h`."
AUTHOR = "Alex Henning"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg python-argcomplete python-catkin-lint roslint sshpass"

RDEPENDS_${PN} = "python-argcomplete python-catkin-lint roslint sshpass"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_tools-release/archive/release/melodic/fetch_tools/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6887e1b74f5f465631e501501daf4305"
SRC_URI[sha256sum] = "6725065102f4c79c28b70da74e34bec0d758dc3c8e458940f70062d96d608914"

S = "${WORKDIR}/fetch_tools-release-release-melodic-fetch_tools-0.2.0-0"

inherit catkin
