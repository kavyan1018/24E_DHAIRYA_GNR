var blogs = [
    {
        id:Math.floor(Math.random()*1000),
        title:'Blog 1',
        content:'This is the first blog',
        image:"https://via.placeholder.com/300x200",
        published:false,
        publishedDate:"2021-01-01"
    },
    {
        id:Math.floor(Math.random()*1000),
        title:'Blog 2',
        content:'This is the second blog',
        image:"https://via.placeholder.com/300x200",
        published:true,
        publishedDate:"2021-01-01"
    },
    

]

const displayBlog =(blog)=>{

    const blogContainer = document.getElementsByClassName('blog-container')[0];
    console.log(blogContainer);

    const blogCard = document.createElement('div');
    blogCard.className = 'blog-card';

    const blogImage = document.createElement('img');
    blogImage.src = blog.image;

    const blogContent = document.createElement('div');
    blogContent.className = 'blog-content';

    //span...
    const blogId = document.createElement('span');
    blogId.className = 'blog-id';
    blogId.innerHTML = blog.id;

    //h2

    const blogTitle = document.createElement('h2');
    blogTitle.className = 'blog-title';
    blogTitle.innerHTML = blog.title;

    //p

    const blogContentText = document.createElement('p');
    blogContentText.className = 'blog-description';
    blogContentText.innerHTML = blog.content;

    //published

    const blogPublished = document.createElement('h5');
    blogPublished.className = 'blog-published';
    if(blog.published){
        blogPublished.innerHTML = 'Published';
        blogPublished.style.color = 'green';
    }
    else{
        blogPublished.innerHTML = 'Not Published';
        blogPublished.style.color = 'red';
    }
    const blogPublishedDate = document.createElement('h5');
    blogPublishedDate.className = 'blog-publishedDate';
    blogPublishedDate.innerHTML = blog.publishedDate;


    //content
    blogContent.appendChild(blogId);
    blogContent.appendChild(blogTitle);
    blogContent.appendChild(blogContentText);
    blogContent.appendChild(blogPublished)
    blogContent.appendChild(blogPublishedDate)


    //image
    blogCard.appendChild(blogImage);
    blogCard.appendChild(blogContent);


    blogContainer.appendChild(blogCard);
}

document.addEventListener('DOMContentLoaded', function() {

    
    blogs.forEach((blog)=>{
        displayBlog(blog)
    })


});
