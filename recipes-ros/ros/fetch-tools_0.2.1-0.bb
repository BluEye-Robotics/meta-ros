DESCRIPTION = "Commands for performing common operations when developing on the robots. For help, run `fetch -h` and `fetch COMMAND -h`."
AUTHOR = "Alex Henning"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-rospkg"

RDEPENDS_${PN} = "python-argcomplete python-catkin-lint roslint sshpass"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_tools-release/archive/release/melodic/fetch_tools/0.2.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33ab2540b83c1e3e6cfeca7416471cf3"
SRC_URI[sha256sum] = "1dc7b3cc138e2c8bd7aefabfe41c5330f581f101b7d668e4873fc5657be92c73"

S = "${WORKDIR}/fetch_tools-release-release-melodic-fetch_tools-0.2.1-0"

inherit catkin
