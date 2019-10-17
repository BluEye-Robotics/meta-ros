DESCRIPTION = "Asynchronous Web/WebSocket Server in C++"
AUTHOR = "Mitchell Wills"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "openssl boost openssl boost python3-websocket"

RDEPENDS_${PN} = "openssl boost python3-websocket"

SRC_URI = "https://github.com/gt-rail-release/async_web_server_cpp-release/archive/release/melodic/async_web_server_cpp/0.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9a727454a9d206b7bdf2d58afa84f3c9"
SRC_URI[sha256sum] = "45d13cce4a77b0e5e67b9ed7be20691e0425861c5a48a653d4a3bdff997840c6"

S = "${WORKDIR}/async_web_server_cpp-release-release-melodic-async_web_server_cpp-0.0.3-0"

inherit catkin
